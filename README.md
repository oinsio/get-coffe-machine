# Programmer Day 2022 Contest

## Help programmer to get to a coffee machine

Your goal is to find all possible ways through the office from current programmer’s location to a lovely coffee machine. Also, you should avoid meeting with obstacles like an angry project manager a.k.a. PM.

## Inputs

On input you’ll get a m x n grid of integers, where each value could be:
* 1 – this would be a starting square. There will be exactly one starting square.
* 2 – this would be an ending square. There will be exactly one ending square.
* 0 – represents empty square, way to go!
* -1 – angry PM location, you can’t step in onto this square.

## Rules

* You can walk in 4 directions only: up, down, left, and right.
* You should visit all empty squares exactly once.
* You must not visit squares where angry PM is waiting for you, otherwise you’re doomed.

## Output

As a result, you should return number of **all possible paths** according to the rules above. If there’s no such ways, return 0.

## Code requirements

You can choose programming language from the following list:

| Language   | Input params                               |
| ---------- | ------------------------------------------ |
| C	         | int** grid, int gridSize, int* gridColSize |
| C#         | int[][] grid                               |
| C++        | vector<vector<int>>& grid                  |
| Dart       | List<List<int>> grid                       |
| Go         | grid [][]int                               |
| Java       | int[][] grid                               |
| JavaScript | @param {number[][]} grid                   |
| Kotlin     | grid: Array<IntArray>                      |
| Python     | grid: List[List[int]]                      |
| Swift      | _ grid: [[Int]]                            |
| TypeScript | grid: number[][]                           |

Code should contain just one function with name **programmerPaths** (if language does not support top-level function, you create a class with the name of your choice).
That function should take a grid of integers (see languages table above) as an input and return integer (number of paths).

## Code assessment criteria

* First and foremost, your code must produce valid results. It will be run on a huge set of inputs. Try not to fail any of them.
* Solution performance: the faster the better. Turtle-speed cases will not give you extra points, for sure.
* Caution to details: read task definition carefully. If you miss any tiny bit of requirements, you’ll be fined.
* Comments are not required but may give you a few extra points if they will be godly perfect.
* Everybody are welcomed to solve this task. To treat everyone equally, your own level will be considered: juniors will gain some boost, middles will be treated most accurately and seniors will be a bit handycapped.

## Examples

### Example 1

**Input**: grid = [[1,0,0,0],[0,0,0,0],[0,0,2,-1]]

**Output**: 2

**Explanation**: We have the following two paths: 

1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2)
2. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2)

| Programmer |            |                |    |
| ---------- | ---------- | -------------- | -- |
|            |            |                |    |
|            |            | Coffee machine | PM |

### Example 2

**Input**: grid = [[0,2],[1,0]]

**Output**: 0

**Explanation**: Bad luck, you can’t move diagonally thus there’s no way to a coffee machine which visits all empty squares.

|            | Coffee machine |
| ---------- | -------------- |
| Programmer |                |
