import math
import matplotlib.pyplot as plt
import numpy

def f(x):
    return x*x

a = numpy.arange(100)

b = f(a)

plt.plot(a,b)
plt.xlabel("x")
plt.ylabel("X^2")
plt.show()