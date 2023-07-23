package com.henry.springboot3springsecurity6oauth2jwt.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "sub",
        "resource_access",
        "email_verified",
        "allowed-origins",
        "iss",
        "typ",
        "preferred_username",
        "given_name",
        "sid",
        "aud",
        "acr",
        "realm_access",
        "azp",
        "scope",
        "name",
        "exp",
        "session_state",
        "iat",
        "family_name",
        "jti",
        "email"
})
@Generated("jsonschema2pojo")
public class JWTTokenDto {

    @JsonProperty("sub")
    private String sub;
    @JsonProperty("resource_access")
    private ResourceAccess resourceAccess;
    @JsonProperty("email_verified")
    private Boolean emailVerified;
    @JsonProperty("allowed-origins")
    private List<String> allowedOrigins = new ArrayList<String>();
    @JsonProperty("iss")
    private String iss;
    @JsonProperty("typ")
    private String typ;
    @JsonProperty("preferred_username")
    private String preferredUsername;
    @JsonProperty("given_name")
    private String givenName;
    @JsonProperty("sid")
    private String sid;
    @JsonProperty("aud")
    private List<String> aud = new ArrayList<String>();
    @JsonProperty("acr")
    private String acr;
    @JsonProperty("realm_access")
    private RealmAccess realmAccess;
    @JsonProperty("azp")
    private String azp;
    @JsonProperty("scope")
    private String scope;
    @JsonProperty("name")
    private String name;
    @JsonProperty("exp")
    private Double exp;
    @JsonProperty("session_state")
    private String sessionState;
    @JsonProperty("iat")
    private Double iat;
    @JsonProperty("family_name")
    private String familyName;
    @JsonProperty("jti")
    private String jti;
    @JsonProperty("email")
    private String email;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sub")
    public String getSub() {
        return sub;
    }

    @JsonProperty("sub")
    public void setSub(String sub) {
        this.sub = sub;
    }

    public JWTTokenDto withSub(String sub) {
        this.sub = sub;
        return this;
    }

    @JsonProperty("resource_access")
    public ResourceAccess getResourceAccess() {
        return resourceAccess;
    }

    @JsonProperty("resource_access")
    public void setResourceAccess(ResourceAccess resourceAccess) {
        this.resourceAccess = resourceAccess;
    }

    public JWTTokenDto withResourceAccess(ResourceAccess resourceAccess) {
        this.resourceAccess = resourceAccess;
        return this;
    }

    @JsonProperty("email_verified")
    public Boolean getEmailVerified() {
        return emailVerified;
    }

    @JsonProperty("email_verified")
    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public JWTTokenDto withEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
        return this;
    }

    @JsonProperty("allowed-origins")
    public List<String> getAllowedOrigins() {
        return allowedOrigins;
    }

    @JsonProperty("allowed-origins")
    public void setAllowedOrigins(List<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
    }

    public JWTTokenDto withAllowedOrigins(List<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    @JsonProperty("iss")
    public String getIss() {
        return iss;
    }

    @JsonProperty("iss")
    public void setIss(String iss) {
        this.iss = iss;
    }

    public JWTTokenDto withIss(String iss) {
        this.iss = iss;
        return this;
    }

    @JsonProperty("typ")
    public String getTyp() {
        return typ;
    }

    @JsonProperty("typ")
    public void setTyp(String typ) {
        this.typ = typ;
    }

    public JWTTokenDto withTyp(String typ) {
        this.typ = typ;
        return this;
    }

    @JsonProperty("preferred_username")
    public String getPreferredUsername() {
        return preferredUsername;
    }

    @JsonProperty("preferred_username")
    public void setPreferredUsername(String preferredUsername) {
        this.preferredUsername = preferredUsername;
    }

    public JWTTokenDto withPreferredUsername(String preferredUsername) {
        this.preferredUsername = preferredUsername;
        return this;
    }

    @JsonProperty("given_name")
    public String getGivenName() {
        return givenName;
    }

    @JsonProperty("given_name")
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public JWTTokenDto withGivenName(String givenName) {
        this.givenName = givenName;
        return this;
    }

    @JsonProperty("sid")
    public String getSid() {
        return sid;
    }

    @JsonProperty("sid")
    public void setSid(String sid) {
        this.sid = sid;
    }

    public JWTTokenDto withSid(String sid) {
        this.sid = sid;
        return this;
    }

    @JsonProperty("aud")
    public List<String> getAud() {
        return aud;
    }

    @JsonProperty("aud")
    public void setAud(List<String> aud) {
        this.aud = aud;
    }

    public JWTTokenDto withAud(List<String> aud) {
        this.aud = aud;
        return this;
    }

    @JsonProperty("acr")
    public String getAcr() {
        return acr;
    }

    @JsonProperty("acr")
    public void setAcr(String acr) {
        this.acr = acr;
    }

    public JWTTokenDto withAcr(String acr) {
        this.acr = acr;
        return this;
    }

    @JsonProperty("realm_access")
    public RealmAccess getRealmAccess() {
        return realmAccess;
    }

    @JsonProperty("realm_access")
    public void setRealmAccess(RealmAccess realmAccess) {
        this.realmAccess = realmAccess;
    }

    public JWTTokenDto withRealmAccess(RealmAccess realmAccess) {
        this.realmAccess = realmAccess;
        return this;
    }

    @JsonProperty("azp")
    public String getAzp() {
        return azp;
    }

    @JsonProperty("azp")
    public void setAzp(String azp) {
        this.azp = azp;
    }

    public JWTTokenDto withAzp(String azp) {
        this.azp = azp;
        return this;
    }

    @JsonProperty("scope")
    public String getScope() {
        return scope;
    }

    @JsonProperty("scope")
    public void setScope(String scope) {
        this.scope = scope;
    }

    public JWTTokenDto withScope(String scope) {
        this.scope = scope;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public JWTTokenDto withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("exp")
    public Double getExp() {
        return exp;
    }

    @JsonProperty("exp")
    public void setExp(Double exp) {
        this.exp = exp;
    }

    public JWTTokenDto withExp(Double exp) {
        this.exp = exp;
        return this;
    }

    @JsonProperty("session_state")
    public String getSessionState() {
        return sessionState;
    }

    @JsonProperty("session_state")
    public void setSessionState(String sessionState) {
        this.sessionState = sessionState;
    }

    public JWTTokenDto withSessionState(String sessionState) {
        this.sessionState = sessionState;
        return this;
    }

    @JsonProperty("iat")
    public Double getIat() {
        return iat;
    }

    @JsonProperty("iat")
    public void setIat(Double iat) {
        this.iat = iat;
    }

    public JWTTokenDto withIat(Double iat) {
        this.iat = iat;
        return this;
    }

    @JsonProperty("family_name")
    public String getFamilyName() {
        return familyName;
    }

    @JsonProperty("family_name")
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public JWTTokenDto withFamilyName(String familyName) {
        this.familyName = familyName;
        return this;
    }

    @JsonProperty("jti")
    public String getJti() {
        return jti;
    }

    @JsonProperty("jti")
    public void setJti(String jti) {
        this.jti = jti;
    }

    public JWTTokenDto withJti(String jti) {
        this.jti = jti;
        return this;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public JWTTokenDto withEmail(String email) {
        this.email = email;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public JWTTokenDto withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JWTTokenDto.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sub");
        sb.append('=');
        sb.append(((this.sub == null) ? "<null>" : this.sub));
        sb.append(',');
        sb.append("resourceAccess");
        sb.append('=');
        sb.append(((this.resourceAccess == null) ? "<null>" : this.resourceAccess));
        sb.append(',');
        sb.append("emailVerified");
        sb.append('=');
        sb.append(((this.emailVerified == null) ? "<null>" : this.emailVerified));
        sb.append(',');
        sb.append("allowedOrigins");
        sb.append('=');
        sb.append(((this.allowedOrigins == null) ? "<null>" : this.allowedOrigins));
        sb.append(',');
        sb.append("iss");
        sb.append('=');
        sb.append(((this.iss == null) ? "<null>" : this.iss));
        sb.append(',');
        sb.append("typ");
        sb.append('=');
        sb.append(((this.typ == null) ? "<null>" : this.typ));
        sb.append(',');
        sb.append("preferredUsername");
        sb.append('=');
        sb.append(((this.preferredUsername == null) ? "<null>" : this.preferredUsername));
        sb.append(',');
        sb.append("givenName");
        sb.append('=');
        sb.append(((this.givenName == null) ? "<null>" : this.givenName));
        sb.append(',');
        sb.append("sid");
        sb.append('=');
        sb.append(((this.sid == null) ? "<null>" : this.sid));
        sb.append(',');
        sb.append("aud");
        sb.append('=');
        sb.append(((this.aud == null) ? "<null>" : this.aud));
        sb.append(',');
        sb.append("acr");
        sb.append('=');
        sb.append(((this.acr == null) ? "<null>" : this.acr));
        sb.append(',');
        sb.append("realmAccess");
        sb.append('=');
        sb.append(((this.realmAccess == null) ? "<null>" : this.realmAccess));
        sb.append(',');
        sb.append("azp");
        sb.append('=');
        sb.append(((this.azp == null) ? "<null>" : this.azp));
        sb.append(',');
        sb.append("scope");
        sb.append('=');
        sb.append(((this.scope == null) ? "<null>" : this.scope));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("exp");
        sb.append('=');
        sb.append(((this.exp == null) ? "<null>" : this.exp));
        sb.append(',');
        sb.append("sessionState");
        sb.append('=');
        sb.append(((this.sessionState == null) ? "<null>" : this.sessionState));
        sb.append(',');
        sb.append("iat");
        sb.append('=');
        sb.append(((this.iat == null) ? "<null>" : this.iat));
        sb.append(',');
        sb.append("familyName");
        sb.append('=');
        sb.append(((this.familyName == null) ? "<null>" : this.familyName));
        sb.append(',');
        sb.append("jti");
        sb.append('=');
        sb.append(((this.jti == null) ? "<null>" : this.jti));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null) ? "<null>" : this.email));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.sub == null) ? 0 : this.sub.hashCode()));
        result = ((result * 31) + ((this.realmAccess == null) ? 0 : this.realmAccess.hashCode()));
        result = ((result * 31) + ((this.preferredUsername == null) ? 0 : this.preferredUsername.hashCode()));
        result = ((result * 31) + ((this.givenName == null) ? 0 : this.givenName.hashCode()));
        result = ((result * 31) + ((this.iss == null) ? 0 : this.iss.hashCode()));
        result = ((result * 31) + ((this.typ == null) ? 0 : this.typ.hashCode()));
        result = ((result * 31) + ((this.sid == null) ? 0 : this.sid.hashCode()));
        result = ((result * 31) + ((this.emailVerified == null) ? 0 : this.emailVerified.hashCode()));
        result = ((result * 31) + ((this.aud == null) ? 0 : this.aud.hashCode()));
        result = ((result * 31) + ((this.acr == null) ? 0 : this.acr.hashCode()));
        result = ((result * 31) + ((this.allowedOrigins == null) ? 0 : this.allowedOrigins.hashCode()));
        result = ((result * 31) + ((this.sessionState == null) ? 0 : this.sessionState.hashCode()));
        result = ((result * 31) + ((this.azp == null) ? 0 : this.azp.hashCode()));
        result = ((result * 31) + ((this.scope == null) ? 0 : this.scope.hashCode()));
        result = ((result * 31) + ((this.familyName == null) ? 0 : this.familyName.hashCode()));
        result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.exp == null) ? 0 : this.exp.hashCode()));
        result = ((result * 31) + ((this.iat == null) ? 0 : this.iat.hashCode()));
        result = ((result * 31) + ((this.resourceAccess == null) ? 0 : this.resourceAccess.hashCode()));
        result = ((result * 31) + ((this.jti == null) ? 0 : this.jti.hashCode()));
        result = ((result * 31) + ((this.email == null) ? 0 : this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JWTTokenDto) == false) {
            return false;
        }
        JWTTokenDto rhs = ((JWTTokenDto) other);
        return (((((((((((((((((((((((this.sub == rhs.sub) || ((this.sub != null) && this.sub.equals(rhs.sub))) && ((this.realmAccess == rhs.realmAccess) || ((this.realmAccess != null) && this.realmAccess.equals(rhs.realmAccess)))) && ((this.preferredUsername == rhs.preferredUsername) || ((this.preferredUsername != null) && this.preferredUsername.equals(rhs.preferredUsername)))) && ((this.givenName == rhs.givenName) || ((this.givenName != null) && this.givenName.equals(rhs.givenName)))) && ((this.iss == rhs.iss) || ((this.iss != null) && this.iss.equals(rhs.iss)))) && ((this.typ == rhs.typ) || ((this.typ != null) && this.typ.equals(rhs.typ)))) && ((this.sid == rhs.sid) || ((this.sid != null) && this.sid.equals(rhs.sid)))) && ((this.emailVerified == rhs.emailVerified) || ((this.emailVerified != null) && this.emailVerified.equals(rhs.emailVerified)))) && ((this.aud == rhs.aud) || ((this.aud != null) && this.aud.equals(rhs.aud)))) && ((this.acr == rhs.acr) || ((this.acr != null) && this.acr.equals(rhs.acr)))) && ((this.allowedOrigins == rhs.allowedOrigins) || ((this.allowedOrigins != null) && this.allowedOrigins.equals(rhs.allowedOrigins)))) && ((this.sessionState == rhs.sessionState) || ((this.sessionState != null) && this.sessionState.equals(rhs.sessionState)))) && ((this.azp == rhs.azp) || ((this.azp != null) && this.azp.equals(rhs.azp)))) && ((this.scope == rhs.scope) || ((this.scope != null) && this.scope.equals(rhs.scope)))) && ((this.familyName == rhs.familyName) || ((this.familyName != null) && this.familyName.equals(rhs.familyName)))) && ((this.name == rhs.name) || ((this.name != null) && this.name.equals(rhs.name)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.exp == rhs.exp) || ((this.exp != null) && this.exp.equals(rhs.exp)))) && ((this.iat == rhs.iat) || ((this.iat != null) && this.iat.equals(rhs.iat)))) && ((this.resourceAccess == rhs.resourceAccess) || ((this.resourceAccess != null) && this.resourceAccess.equals(rhs.resourceAccess)))) && ((this.jti == rhs.jti) || ((this.jti != null) && this.jti.equals(rhs.jti)))) && ((this.email == rhs.email) || ((this.email != null) && this.email.equals(rhs.email))));
    }

}
