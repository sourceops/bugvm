/*
 * Copyright (C) 2012 RoboVM
 *
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
 */
package org.robovm.cocoatouch.uikit;

import java.util.*;

public enum UISwipeGestureRecognizerDirection implements ValuedEnum {
    Right(1 << 0),
    Left(1 << 1),
    Up(1 << 2),
    Down(1 << 3);

    private final int n;

    private UISwipeGestureRecognizerDirection(int n) { this.n = n; }
    public int value() { return n; }
    public static UISwipeGestureRecognizerDirection fromValue(int n) {
        for (UISwipeGestureRecognizerDirection v : values()) {
            if (n == v.value()) {
                return v;
            }
        }
        throw new IllegalArgumentException("Unknown UISwipeGestureRecognizerDirection value: " + n);
    }
}