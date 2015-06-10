package org.keycloak.models.sessions.mem.entities;

import org.keycloak.models.ClientSessionModel;
import org.keycloak.models.UserSessionModel;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author <a href="mailto:sthorger@redhat.com">Stian Thorgersen</a>
 */
public class ClientSessionEntity {

    private String id;
    private String clientId;
    private String realmId;
    private Map<String, UserSessionModel.AuthenticatorStatus> authenticatorStatus = new HashMap<>();
    private String authUserId;

    private UserSessionEntity session;

    private String redirectUri;
    private String authMethod;

    private int timestamp;
    private String action;
    private Set<String> roles;
    private Set<String> protocolMappers;
    private Map<String, String> notes = new HashMap<>();
    private Map<String, String> userSessionNotes = new HashMap<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getRealmId() {
        return realmId;
    }

    public void setRealmId(String realmId) {
        this.realmId = realmId;
    }

    public UserSessionEntity getSession() {
        return session;
    }

    public void setSession(UserSessionEntity session) {
        this.session = session;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public Set<String> getProtocolMappers() {
        return protocolMappers;
    }

    public void setProtocolMappers(Set<String> protocolMappers) {
        this.protocolMappers = protocolMappers;
    }

    public Map<String, String> getNotes() {
        return notes;
    }

    public String getAuthMethod() {
        return authMethod;
    }

    public void setAuthMethod(String authMethod) {
        this.authMethod = authMethod;
    }

    public String getAuthUserId() {
        return authUserId;
    }

    public void setAuthUserId(String authUserId) {
        this.authUserId = authUserId;
    }

    public Map<String, UserSessionModel.AuthenticatorStatus> getAuthenticatorStatus() {
        return authenticatorStatus;
    }

    public void setAuthenticatorStatus(Map<String, UserSessionModel.AuthenticatorStatus> authenticatorStatus) {
        this.authenticatorStatus = authenticatorStatus;
    }

    public Map<String, String> getUserSessionNotes() {
        return userSessionNotes;
    }
}
