package bankbonussystem.demo.domain;

import java.util.Set;

public enum Role {
    MANAGER(Set.of()),
    FINANCIAL_MANAGER(Set.of()),
    ADMIN(Set.of());

    public Set<Permission> getPermissions() {
        return permissions;
    }

    private final Set<Permission> permissions; //todo

    Role(Set<Permission> permissions) {
        this.permissions = permissions;
    }
}
