---
# try also 'default' to start simple
theme: ./mathema-2021

# infos for the footer (on slides with the default-with-footer layout)
company: "MATHEMA"
presenter: ""
contact: "patrick.drechsler@mathema.de"

# apply any windi css classes to the current slide
class: 'text-center'

highlighter: shiki

# some information about the slides, markdown enabled
info: |
  ## Mutation Testing

# persist drawings in exports and build
drawings:
  persist: false
---

# Mutation Testing

### Patrick Drechsler

---

## Code Coverage 100%

what more do you want?

---
layout: my-two-cols
---

::top::

## Example

::left::

```csharp
public class Rules
{
  public bool IsValid(string s)
  {
    if (string.IsNullOrWhiteSpace(s))
    {
      return false;
    }

    if (s.Length > 3)
    {
      return false;
    }

    return true;
  }
}

```

::right::

```csharp
public class RulesTests
{
  private readonly Rules _sut;
  
  public RulesTests() => _sut = new Rules();

  [Theory]
  [InlineData("", false)]
  [InlineData("a", true)]
  [InlineData("12345", true)]  
  public void Validation_works(
    string input, bool expected) => 
    _sut.IsValid(input).Should().Be(expected);
}
```

::bottom::

- 100% coverage...
- but, are we covering all corner cases?

---

## Let's create some mutants!

Let's change

```csharp
if (s.Length > 3)
```

to

```csharp
if (s.Length < 3) // <- this is a "MUTANT"
```

```csharp
if (s.Length >= 3) // <- this is another "MUTANT"
```


```csharp
if (s.Length <= 3) // <- this is yet another "MUTANT"
```

Do we still have the same code coverage?

---

## Concept of mutation testing

- Production code is modified (by the mutation testing framework)
- Test suite is run

Did any mutants survive?

- If all mutants die, the test suite is fine
- But if some mutants survive, the tests are not covering all cases

Many mutation frameworks have an interactive html report
---

## Live Demo

Demo is in C#

Frameworks for other languages are available

For some languages there is a demo in the repo:

- Java (using PIT)
- Javascript (using Stryker)
- Python (using Cosmic-Ray)

But the concept is available in most languages

---

## Mutation Testing: Summary

- Mutation testing is a process of testing code for unintended side effects
- Don't include it in your CI/CD pipeline (it's not a low resource process)!
- Use it as an exploratory tool to find bugs in your code
- Use it to find critical bugs in your code
