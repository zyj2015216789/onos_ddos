/*
 * Copyright 2016-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.patchpanel.impl;

import org.onosproject.net.ConnectPoint;

import java.util.Set;

/**
 * A service for the patch panel application to export and use with the cli.
 */
public interface PatchPanelService {

    /**
     * Adds a new patch between two connect points.
     *
     * @param cp    the first connect point
     * @param cp2   the second connect point
     * @return      true if the patch was created, false otherwise
     */
    boolean addPatch(ConnectPoint cp, ConnectPoint cp2);

    /**
     * Removes an existing patch.
     *
     * @param id patch ID
     * @return true if the patch was removed, otherwise false.
     */
    boolean removePatch(PatchId id);

    /**
     * Gets the set of patches in the system.
     *
     * @return set of patches
     */
    Set<Patch> getPatches();
}
