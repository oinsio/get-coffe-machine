package cto.fantask

import spock.lang.Shared
import spock.lang.Specification

class PathToCoffeeMachineTest extends Specification {

    @Shared
    def underTest = new PathToCoffeeMachine()

    def "should return 0 path"() {
        given:
            int[][] grid = [[0, 2] [1, 0]]
        expect:
            underTest.programmerPaths(grid) == 0
    }

}