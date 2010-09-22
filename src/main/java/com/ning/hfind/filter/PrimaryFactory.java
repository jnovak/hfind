/*
 * Copyright 2010 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.hfind.filter;

public class PrimaryFactory
{
    public static Primary getPrimary(String primary, String argument)
    {
        if (primary.equals("name")) {
            return new NamePrimary(argument);
        }
        else if (primary.equals("nouser")) {
            return new NoUserPrimary();
        }
        else if (primary.equals("nogroup")) {
            return new NoGroupPrimary();
        }
        else if (primary.equals("prune")) {
            return Primary.ALWAYS_MATCH;
        }
        else if (primary.equals("perm")) {
            throw new IllegalArgumentException("TODO");
        }
        else if (primary.equals("type")) {
            return new TypePrimary(argument);
        }
        else if (primary.equals("user")) {
            return new UserPrimary(argument);
        }
        else if (primary.equals("group")) {
            return new GroupPrimary(argument);
        }
        else if (primary.equals("size")) {
            return new SizePrimary(argument);
        }
        else if (primary.equals("mtime")) {
            throw new IllegalArgumentException("TODO");
        }
        else if (primary.equals("newer")) {
            throw new IllegalArgumentException("TODO");
        }
        else if (primary.equals("depth")) {
            throw new IllegalArgumentException("TODO");
        }
        else {
            throw new IllegalArgumentException(String.format("Primary %s (argument %s) not implemented", primary, argument));
        }
    }
}