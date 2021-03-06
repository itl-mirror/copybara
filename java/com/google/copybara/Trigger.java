/*
 * Copyright (C) 2018 Google Inc.
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

package com.google.copybara;

import com.google.common.collect.ImmutableSetMultimap;
import com.google.devtools.build.lib.syntax.Printer;
import com.google.devtools.build.lib.syntax.StarlarkValue;
import net.starlark.java.annot.StarlarkBuiltin;
import net.starlark.java.annot.StarlarkDocumentationCategory;

/** Starter of feedback migration executions. */
@StarlarkBuiltin(
    name = "trigger",
    doc = "Starter of feedback migration executions.",
    category = StarlarkDocumentationCategory.TOP_LEVEL_TYPE,
    documented = false)
public interface Trigger extends StarlarkValue {

  Endpoint getEndpoint();

  @Override
  default void repr(Printer printer) {
    printer.append(toString());
  }

  ImmutableSetMultimap<String, String> describe();
}
