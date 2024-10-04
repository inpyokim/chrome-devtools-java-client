package com.github.kklisura.cdt.protocol.events.dom;

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

/** Fired when a node's scrollability state changes. */
@Experimental
public class ScrollableFlagUpdated {

  private Integer nodeId;

  private Boolean isScrollable;

  /** The id of the node. */
  public Integer getNodeId() {
    return nodeId;
  }

  /** The id of the node. */
  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }

  /** If the node is scrollable. */
  public Boolean getIsScrollable() {
    return isScrollable;
  }

  /** If the node is scrollable. */
  public void setIsScrollable(Boolean isScrollable) {
    this.isScrollable = isScrollable;
  }
}
