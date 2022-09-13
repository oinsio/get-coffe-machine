package cto.fantask

import spock.lang.Specification

class PathToCoffeeMachineTest extends Specification {

    def "should return 0 path"() {
        given:
            int[][] grid = [[0, 2] [1, 0]]
        expect:
            PathToCoffeeMachine.programmerPaths(grid) == 0
    }

    def "should return 2 paths"() {
        given:
            int[][] grid = [[1, 0, 0, 0] [0, 0, 0, 0] [0, 0, 2, -1]]
        expect:
            PathToCoffeeMachine.programmerPaths(grid) == 2
    }

}