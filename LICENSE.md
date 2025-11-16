# License

Copyright (c) 2024 DFiant Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

## Third-Party IP and Vendor Licenses

This library contains DFHDL wrapper code that provides API abstractions for commercial FPGA devices, boards, and IPs from various vendors, as well as open-source ASIC workflows.

**IMPORTANT DISCLAIMERS:**

1. **Library Code License**: The DFHDL wrapper code in this library is licensed under Apache 2.0 as stated above.

2. **Vendor IP Licenses**: The underlying vendor IPs, device information, and related materials referenced by the wrappers are subject to their respective vendor licenses and End User License Agreements (EULAs). This includes, but is not limited to:
   - **Xilinx/AMD**: Xilinx IP cores and device information are subject to Xilinx's license terms
   - **Intel/Altera**: Intel/Altera IP cores and device information are subject to Intel's license terms
   - **Gowin**: Gowin device information is subject to Gowin's license terms
   - **Lattice**: Lattice device information is subject to Lattice's license terms

3. **User Responsibility**: Users of this library are solely responsible for:
   - Complying with all applicable vendor EULAs and license terms
   - Obtaining proper licenses for vendor IPs they intend to use
   - Ensuring their use of vendor IPs complies with vendor terms and conditions

4. **No Warranty**: This library and its wrappers are provided "AS IS" without any warranty or guarantee of:
   - Compatibility with vendor IPs or tools
   - Accuracy of device information or pin mappings
   - Compliance with vendor license requirements
   - Fitness for any particular purpose

5. **No Liability**: DFiant Inc. and contributors to this library are not responsible for:
   - Any violations of vendor license terms by users
   - Any issues arising from the use of vendor IPs
   - Any claims or disputes related to vendor IP licensing

6. **Wrapper Nature**: The wrappers in this library are API abstractions and do not reproduce or distribute vendor IP code. They provide a DFHDL interface to vendor IPs and device information that users must obtain separately through proper vendor channels.

For vendor-specific license information, please refer to:
- Xilinx/AMD: https://www.xilinx.com/legal.html
- Intel/Altera: https://www.intel.com/content/www/us/en/legal/terms-of-use.html
- Gowin: Contact Gowin Semiconductor for license terms
- Lattice: https://www.latticesemi.com/en/Support/Licensing

See the NOTICE file for additional third-party attributions.
