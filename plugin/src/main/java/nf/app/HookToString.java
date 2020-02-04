/*
 * Copyright 2013-2019, Centre for Genomic Regulation (CRG)
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

package nf.app;

import java.util.Collection;
import java.util.concurrent.Callable;

import net.bytebuddy.implementation.bind.annotation.SuperCall;

/**
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
public class HookToString {

    static String formatCollection(Collection collection, boolean verbose, int maxSize, boolean safe, @SuperCall Callable<Object> context) throws Exception {
        System.out.println("++ BEFORE format collection");
        Object result = context.call();
        System.out.println("++ AFTER format collection");
        return (String)result;
    }
}
