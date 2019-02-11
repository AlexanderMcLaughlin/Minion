# Minion
Welcome treasure hunter! I am the great and powerful interplanetary ninja and you are my
minion. We must hurry to save this planet from the evil, “Dialog Not Found”. We must travel
across the land so that I may prevent “Dialog Not Found” from their evil plans. Also just so you
know, minion, I am unable to triumph over a great many trials. Some of these include being
looked at, handshakes, and even stairs.

The Problem:
Given a map of locations, routes between locations, and the trials which exist along routes, help
the interplanetary ninja reach their target. You must avoid any of the trials that the ninja is
unable to triumph over. Then tell the interplanetary ninja if they are able to reach their target and
save the world.

The Input:
The first input line contains a positive integer, m, indicating the number of maps to check. Each
map will start with an integer on a new line, t (0 ≤ t ≤ 50), that describes the number of trials that
the ninja is unable to accomplish. On the next t lines these trials are listed, one per line. The
following line will contain two integers, n (2 ≤ n ≤ 30) and e (0 ≤ e ≤ 500). n indicates the
number of locations on the map (numbered 0 through n-1) and e indicates the total number of
routes between locations on the map. Assume the ninja’s starting location number is 0 and the
ninja’s target location is n-1.
The following e lines each describe a route between a pair of locations, and the trial on that
route. These lines will consist of two integers La and Lb and a string Q. The ninja can travel
between location La and location Lb, or between Lb and La, as long as he does not have the trial
(Q) on that route. For example, if ninja has the trial “xyz” and the route also has the trial “xyz”,
then ninja cannot travel on that route. Assume that there is at most one route between any two
locations and exactly one trial for a route.
All locations are numbered from 0 to n-1, inclusive. All trials are named using only lowercase
letters, 1 to 20 in length. If a trial is not on the “unable to accomplish” list of ninja, then the
ninja will be able to accomplish it. Successive values on a line are separated by exactly one
space. There are no leading or trailing spaces on any line.

The Output:
For each map, output a line that contains only a 1 if the ninja can reach his target and a 0 if the
ninja is unable to reach his target. Each answer must be on a separate line.

Sample Input:
> 2

> 3

> stairs

> talking

> staring

> 4 5

> 0 3 talking

> 0 1 abc

> 0 2 xyz

> 1 3 stairs

> 2 3 staring

> 3

> fire

> water

> people

> 4 5

> 0 1 abc

> 0 2 water

> 1 2 fire

> 1 3 xyz

> 2 3 abc

Sample Output:
> 0

> 1
