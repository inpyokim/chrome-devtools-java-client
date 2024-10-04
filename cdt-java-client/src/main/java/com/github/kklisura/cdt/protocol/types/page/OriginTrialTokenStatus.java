package com.github.kklisura.cdt.protocol.types.page;

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
 * Origin Trial(https://www.chromium.org/blink/origin-trials) support. Status for an Origin Trial
 * token.
 */
public enum OriginTrialTokenStatus {
  @JsonProperty("Success")
  SUCCESS,
  @JsonProperty("NotSupported")
  NOT_SUPPORTED,
  @JsonProperty("Insecure")
  INSECURE,
  @JsonProperty("Expired")
  EXPIRED,
  @JsonProperty("WrongOrigin")
  WRONG_ORIGIN,
  @JsonProperty("InvalidSignature")
  INVALID_SIGNATURE,
  @JsonProperty("Malformed")
  MALFORMED,
  @JsonProperty("WrongVersion")
  WRONG_VERSION,
  @JsonProperty("FeatureDisabled")
  FEATURE_DISABLED,
  @JsonProperty("TokenDisabled")
  TOKEN_DISABLED,
  @JsonProperty("FeatureDisabledForUser")
  FEATURE_DISABLED_FOR_USER,
  @JsonProperty("UnknownTrial")
  UNKNOWN_TRIAL
}
