/*package methodref;

class Shipment {
	  public double calculateWeight() {
	    double weight = 0;
	    // Calculate weight
	    return weight;
	  }
	}
//	And this method:

	public List<Double> calculateOnShipments(
	  List<Shipment> l, Function<Shipment, Double> f) {
	    List<Double> results = new ArrayList<>();
	    for(Shipment s : l) {
	      results.add(f.apply(s));
	    }
	    return results;
	}
	We can call that method using:

	List<Shipment> l = new ArrayList<Shipment>();

	// Using an anonymous class
	calculateOnShipments(l, new Function<Shipment, Double>() {
	  public Double apply(Shipment s) { // The object
	    return s.calculateWeight(); // The method
	  }
	});

	// Using a lambda expression
	calculateOnShipments(l, s -> s.calculateWeight());

	// Using a method reference
	calculateOnShipments(l, Shipment::calculateWeight);
*/