/*
 * Sibilla:  a Java framework designed to support analysis of Collective
 * Adaptive Systems.
 *
 * Copyright (C) 2020.
 *
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *            http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

package quasylab.sibilla.core.models.pm.util;

import quasylab.sibilla.core.models.pm.FractionOfSpecies;
import quasylab.sibilla.core.models.pm.NumberOfSpecies;
import quasylab.sibilla.core.models.pm.PopulationState;
import quasylab.sibilla.core.simulator.sampling.Measure;

import java.io.Serializable;
import java.util.*;
import java.util.function.Function;

/**
 * @author loreti
 *
 */
public class PopulationRegistry implements Serializable {

	private static final String FRACTION_OF_SPECIES_MEASURE_LABEL = "%%s";
	private static final String NUMBER_OF_SPECIES_MEASURE_LABEL = "#%s";
	private int count;
	
	private final Map<Tuple,Integer> map; 
	private final ArrayList<Tuple> elements;

	public PopulationRegistry() {
		this.count = 0;
		this.map = new HashMap<>();
		this.elements = new ArrayList<>();
	}

	public static PopulationRegistry createRegistry(int size) {
		PopulationRegistry reg = new PopulationRegistry();
		for(int i=0; i<size; i++) {
			reg.register(""+i);
		}
		return reg;
	}

	public static PopulationRegistry createRegistry(String ... species) {
		PopulationRegistry registry = new PopulationRegistry();
		Arrays.stream(species).sequential().forEach(s -> registry.register(s));
		return registry;
	}

	public void register( String label, Object ... values ) {
		Tuple t = new Tuple(label,values);
		if (!map.containsKey(t)) {
			map.put(t, count++);
			elements.add(t);
		}
	}
	
	public int indexOf( String label, Object ... values ) {
		return map.getOrDefault(new Tuple(label,values), -1);
	}
	
	private Tuple tupleOf( int idx ) {
		return elements.get(idx);
	}

	public String stringOf(int idx) {
		return tupleOf(idx).toString();
	}
	
	public int size() {
		return count;
	}
	
	public PopulationState createPopulationState(Function<Object[],Integer> population ) {
		PopulationState state = new PopulationState(count,i -> population.apply(tupleOf(i).values));
		return state;
	}

	public PopulationState createPopulationState() {
		return new PopulationState(count);
	}

	public Measure<PopulationState> fractionMeasure(int i) {
		if ((i<0)||(i>=elements.size())) {
			throw new IndexOutOfBoundsException();
		}
		return new FractionOfSpecies(String.format(FRACTION_OF_SPECIES_MEASURE_LABEL,stringOf(i)),i);
	}

	public Measure<PopulationState> occupancyMeasure(int i) {
		if ((i<0)||(i>=count)) {
			throw new IndexOutOfBoundsException();
		}
		return new NumberOfSpecies(String.format(NUMBER_OF_SPECIES_MEASURE_LABEL,stringOf(i)),i);
	}

	private static class Tuple {

		private String label;

		private Object[] values;
		
		public Tuple( String label, Object ... values ) {
			this.label = label;
			this.values = values;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = label.hashCode();
			result = prime * result + Arrays.deepHashCode(values);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Tuple other = (Tuple) obj;
			if (!this.label.equals(other.label)||!Arrays.deepEquals(values, other.values))
				return false;
			return true;
		}

		@Override
		public String toString() {
			String toReturn = label;
			if (values.length > 0) {
				toReturn += Arrays.deepToString(values);
			}
			return toReturn;
		}


		
	}
}
