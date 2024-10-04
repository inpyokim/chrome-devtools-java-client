package com.github.kklisura.cdt.protocol.events.webauthn;

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

/**
 * Triggered when a credential is deleted, e.g. through
 * PublicKeyCredential.signalUnknownCredential().
 */
public class CredentialDeleted {

  private String authenticatorId;

  private String credentialId;

  public String getAuthenticatorId() {
    return authenticatorId;
  }

  public void setAuthenticatorId(String authenticatorId) {
    this.authenticatorId = authenticatorId;
  }

  public String getCredentialId() {
    return credentialId;
  }

  public void setCredentialId(String credentialId) {
    this.credentialId = credentialId;
  }
}
