/*
 * Copyright (c) 2018. Louis Cognault Ayeva Derman
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

@file:Suppress("NOTHING_TO_INLINE")

package splitties.resources

import android.app.Fragment
import android.content.Context
import android.support.annotation.ArrayRes
import android.support.annotation.BoolRes
import android.support.annotation.IntegerRes
import android.view.View
import splitties.init.appCtx
import android.support.v4.app.Fragment as SupportFragment

inline fun Context.bool(@BoolRes boolResId: Int): Boolean = resources.getBoolean(boolResId)
inline fun SupportFragment.bool(@BoolRes boolResId: Int) = context!!.bool(boolResId)
inline fun Fragment.bool(@BoolRes boolResId: Int) = activity.bool(boolResId)
inline fun View.bool(@BoolRes boolResId: Int) = context.bool(boolResId)
/** Use this method for non configuration dependent resources when you don't have a [Context]
 * or when you're calling it from an Activity or a Fragment member (as the Context is not
 * initialized yet). */
inline fun appBool(@BoolRes boolResId: Int) = appCtx.bool(boolResId)

inline fun Context.int(@IntegerRes intResId: Int): Int = resources.getInteger(intResId)
inline fun SupportFragment.int(@IntegerRes intResId: Int) = context!!.int(intResId)
inline fun Fragment.int(@IntegerRes intResId: Int) = activity.int(intResId)
inline fun View.int(@IntegerRes intResId: Int) = context.int(intResId)
/** Use this method for non configuration dependent resources when you don't have a [Context]
 * or when you're calling it from an Activity or a Fragment member (as the Context is not
 * initialized yet). */
inline fun appInt(@IntegerRes intResId: Int) = appCtx.int(intResId)

inline fun Context.intArray(@ArrayRes intArrayResId: Int): IntArray = resources.getIntArray(intArrayResId)
inline fun SupportFragment.intArray(@ArrayRes intArrayResId: Int) = context!!.intArray(intArrayResId)
inline fun Fragment.intArray(@ArrayRes intArrayResId: Int) = activity.intArray(intArrayResId)
inline fun View.intArray(@ArrayRes intArrayResId: Int) = context.intArray(intArrayResId)
/** Use this method for non configuration dependent resources when you don't have a [Context]
 * or when you're calling it from an Activity or a Fragment member (as the Context is not
 * initialized yet). */
inline fun appIntArray(@ArrayRes intArrayResId: Int) = appCtx.intArray(intArrayResId)