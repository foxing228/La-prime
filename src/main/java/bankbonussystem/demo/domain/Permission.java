package bankbonussystem.demo.domain;

public enum Permission {
    USER_READ("users:read"),
    USER_WRITE("users:write");

    private final String permission;

    public String getPermission() {
        return permission;
    }

    Permission(String permission) {
        this.permission = permission;
    }
}
