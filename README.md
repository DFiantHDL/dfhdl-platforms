# DFHDL Platforms

The DFHDL platforms sub-library is a collection of wrappers around commercial FPGA devices, boards, and IPs, and also opensource ASIC workflow like TinyTapeout. These wrappers provide convenient abstractions for connecting your DFHDL designs to physical hardware resources such as clocks, LEDs, buttons, PMODs, and other peripherals.

## Usage

To use the platforms library in your DFHDL project, add the following dependency to your `build.sbt`:

```scala
libraryDependencies += "io.github.dfianthdl" %% "dfhdl-platforms" % "<version>"
```

Replace `<version>` with the same version as your DFHDL library version. For example:

```scala
libraryDependencies += "io.github.dfianthdl" %% "dfhdl-platforms" % "0.16.0"
```

## Examples

See [`src/test/scala/Playground.scala`](src/test/scala/Playground.scala) for comprehensive examples demonstrating how to use various platforms, including:

- **TinyTapeout** - Open-source ASIC workflow
- **ULX3S** - Radiona FPGA development board
- **Nexys A7** - Digilent FPGA development board
- **Basys3** - Digilent FPGA development board
- **DECA** - Terasic FPGA development board
- **TangPrimer20K** - Sipeed FPGA development board
- **Atum A3 Nano** - Terasic FPGA development board

Each example shows how to:
- Import platform-specific resources
- Configure compiler and programmer options
- Connect design ports to board resources (clocks, LEDs, buttons, PMODs)
- Set up domain configurations and constraints

## Supported Platforms

The platforms library provides wrappers for:

- **FPGA Development Boards**: Various boards from manufacturers like Digilent, Terasic, Radiona, and Sipeed
- **PMODs**: Peripheral modules for connecting additional hardware
- **IP Cores**: Vendor-specific IP cores for clock management, reset handling, and more
- **ASIC Workflows**: TinyTapeout and other open-source ASIC workflows

## License

This library is licensed under the Apache License, Version 2.0. See [LICENSE.md](LICENSE.md) for the full license text.

**Important**: This library contains DFHDL wrapper code licensed under Apache 2.0. However, the underlying vendor IPs, devices, and related materials referenced by the wrappers are subject to their respective vendor licenses and End User License Agreements (EULAs). Users are solely responsible for complying with all applicable vendor license terms when using vendor IPs. See [LICENSE.md](LICENSE.md) and [NOTICE](NOTICE) for detailed information about third-party IPs and vendor licenses.

## Documentation

For more information about DFHDL, visit the [official documentation](https://dfianthdl.github.io/).

