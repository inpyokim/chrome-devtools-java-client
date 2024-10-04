package com.github.kklisura.cdt.protocol.types.storage;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 - 2024 Kenan Klisura
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

@Experimental
public class AttributionReportingAggregatableValueDictEntry {

  private String key;

  private Double value;

  private String filteringId;

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /** number instead of integer because not all uint32 can be represented by int */
  public Double getValue() {
    return value;
  }

  /** number instead of integer because not all uint32 can be represented by int */
  public void setValue(Double value) {
    this.value = value;
  }

  public String getFilteringId() {
    return filteringId;
  }

  public void setFilteringId(String filteringId) {
    this.filteringId = filteringId;
  }
}
