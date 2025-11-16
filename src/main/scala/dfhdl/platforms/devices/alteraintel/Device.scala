/*
 * Copyright (c) 2024 DFiant Inc.
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
 *
 * DISCLAIMER: This file contains a DFHDL wrapper around Intel/Altera IP/device
 * information. The wrapper code is licensed under Apache 2.0, but the
 * underlying Intel/Altera IP/device is subject to Intel/Altera's license terms.
 * Users must comply with Intel/Altera's End User License Agreement (EULA)
 * and license terms when using Intel/Altera products. This wrapper is provided
 * as-is without any warranty or guarantee of compatibility with Intel/Altera IP.
 */
package dfhdl.platforms.devices.alteraintel
import dfhdl.hw.constraints.*

abstract class Device(pro: Boolean) extends dfhdl.platforms.devices.Device:
  final lazy val vendor: deviceID.Vendor = deviceID.Vendor.AlteraIntel(pro)
