package ProblemSet_4a;

public class Day {
	private Session[] sessions;
	private String name;

	public Day(String name) {
		this.name = name;
		this.sessions = new Session[4];
	}

	public String getName() {
		return this.name;
	}

	public Session getSessions(int index) {
		return this.sessions[index];
	}

	public void setSession(int index, String moduleName,
			int startTime, int endTime) {
		Session session = new Session(moduleName, startTime, endTime);
		sessions[index] = session;
	}

	public void display() {
		System.out.println(this.name);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Session session : this.sessions) {
			if (session != null) {
				sb.append(session.getSessionName() + ": ");
				sb.append(session.getStartTime() + " - ");
				sb.append(session.getEndTime());
				sb.append("\n");
			}
		}

		return sb.toString();
	}
}
