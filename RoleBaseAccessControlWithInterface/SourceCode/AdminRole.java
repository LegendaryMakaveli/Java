public interface AdminRole {
    String addSubAdmin();

    String removeSubAdmin();

    String removeUser();

    String viewSystemStatus();
}

//Each interface is like a promise that a class that implements it must define its methods...an admin must do all what its implement