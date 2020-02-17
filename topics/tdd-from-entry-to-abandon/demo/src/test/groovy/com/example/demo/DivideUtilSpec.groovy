package com.example.demo

import spock.lang.Specification

class DivideUtilSpec extends Specification {

    def "#a / #b is #result"() {
        def r = DivideUtil.divide(a, b)

        expect:
        result == r

        where:
        a   | b     | result
        6   | 3     | 2
        5   | 2     | 2.5
        11  | 3     | 11d/3d
    }

    def 'throw exception'() {
        when:
        DivideUtil.divide(11, 0)

        then:
        thrown(RuntimeException)
    }

}
