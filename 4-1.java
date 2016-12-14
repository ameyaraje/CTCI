public class Q4A{

	enum states = {visiting, unvisited, visited}

	public boolean pathExists(Graph g, Node start, Node end) {

		if (start == end)
			return true;

		LinkedList<Node> list = new LinkedList<Node>();

		for (Node n : g.getNodes()) {
			n.state = states.unvisited;
		}

		start.state = states.visiting;

		list.add(start);

		Node temp;

		while (!list.isEmpty) {
			temp = list.removeFirst();

			if (temp != null) {
				for (Node temp1 : temp.getAdjacentNodes()) {
					if (temp1.state == unvisited) {
						if (temp1 == end)
							return true;
						else {
							temp1.state = visiting;
							list.add(temp1);
						}
					}
				}
			}
			temp.state = visited;
		}

		return false;
	}
}