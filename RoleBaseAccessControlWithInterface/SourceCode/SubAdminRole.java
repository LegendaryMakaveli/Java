public interface SubAdminRole {
    String addUser();

    String monitorUser();

    String reportIssues();
}

//Each interface is like a promise that a class that implements it must define its methods