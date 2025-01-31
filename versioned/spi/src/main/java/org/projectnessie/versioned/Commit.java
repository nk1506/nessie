/*
 * Copyright (C) 2020 Dremio
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.projectnessie.versioned;

import java.util.List;
import javax.annotation.Nullable;
import org.immutables.value.Value;
import org.projectnessie.model.CommitMeta;

@Value.Immutable
public interface Commit extends Hashable {
  static ImmutableCommit.Builder builder() {
    return ImmutableCommit.builder();
  }

  @Override
  Hash getHash();

  CommitMeta getCommitMeta();

  @Nullable
  @jakarta.annotation.Nullable
  Hash getParentHash();

  @Nullable
  @jakarta.annotation.Nullable
  List<Operation> getOperations();
}
