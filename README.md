# rated-location
Example POC showing uni-directional ManyToMany relationship

You can run:

    mvn clean package jetty:run

a curl command like:

    curl -v 'http://localhost:8080/?name=Kuala%20Lumpur'

returns some JSON to consume.

# uni-directional ManyToMany relationships

For normalized databases you often want to use these kinds of
relationships. Say you have a Foo object that contains many Bar's so
its relevant to have a Collection<Bar> inside of Foo, but you don't
want to Bar's to have any knowledge of the Foo's they may or may not
be associated with. This setup has a join table that maps Bar's to
their Foo's. The unique constraint would be on the Foo's id AND the Bar's id
allowing you to associate the same Bar objects with multiple Foo
objects (but not associate the same Bar, multiple times, to the same Foo).

In this example, Location has a Set<RatedLocation> but RatedLocation
has no knowledge of the Location's. Set semantics are un-ordered
which is probably appropriate for this kind of join table. You can
iterate over the Set, just don't expect the same order each time or
provide your own ordering (e.g. distance from Location).
