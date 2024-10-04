package com.github.kklisura.cdt.protocol.types.autofill;

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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specified whether a filled field was done so by using the html autocomplete attribute or autofill
 * heuristics.
 */
public enum FillingStrategy {
  @JsonProperty("autocompleteAttribute")
  AUTOCOMPLETE_ATTRIBUTE,
  @JsonProperty("autofillInferred")
  AUTOFILL_INFERRED
}
