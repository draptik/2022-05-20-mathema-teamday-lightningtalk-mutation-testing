# Stryker.NET

Documentation: https://stryker-mutator.io/docs/stryker-net/introduction/

## Prerequisites

Run `dotnet tool restore` in the same folder as the `sln` file is located. This will install Stryker.

## Running Stryker

- Switch to folder `DemoLibTests`
- Run `run-stryker.sh`

This will create a new folder `StrykerOutput` with a subfolder for each run.

Example:

```txt
❯ tree .         
.
├── ...
├── run-stryker.sh
└── StrykerOutput
    └── 2022-05-13.15-38-47
        └── reports
            └── mutation-report.html
```

The file `mutation-report.html` can be viewed in a browser.
