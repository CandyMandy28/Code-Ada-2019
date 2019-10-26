from distutils.core import setup
from setuptools import setup, find_packages

try:
    import string
except ImportError:
    print("Warning: `string` must be installed in order to use `Code-Ada-2019`")
try:
    import time
except ImportError:
    print("Warning: `time` must be installed in order to use `Code-Ada-2019`")