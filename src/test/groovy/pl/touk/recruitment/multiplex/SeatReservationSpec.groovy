package pl.touk.recruitment.multiplex

import spock.lang.Specification

class SeatReservationSpec extends Specification {


    def "should successfully reserve seat"() {

        when: "The user selects the day and the time when he/she would like to see the movie"

        then: "The system lists movies available in the given time interval - title and screening times"

        when: "The user chooses a particular screening"

        then: "The system gives information regarding screening room and available seats"

        when: "The user chooses seats, and gives the name of the person doing the reservation (name and surname)"

        then: "The system gives back the total amount to pay and reservation expiration time"

    }
}