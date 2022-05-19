import pytest
from python_demo import __version__
from python_demo.rules import Rules


def test_version():
    assert __version__ == '0.1.0'


def test_is_valid():
    rules = Rules()
    assert rules.is_valid("1") is True
