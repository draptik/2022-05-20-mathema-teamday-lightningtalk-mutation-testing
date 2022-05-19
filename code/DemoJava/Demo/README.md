# Mutation Testing with Pitest

Visit https://pitest.org/ for more information.

## Usage

The following command will execute pitest

    $ mvn test-compile org.pitest:pitest-maven:mutationCoverage

This will output a html report to `target/pit-reports/YYYYMMDDHHMI`.
Open the generated report in your browser.
