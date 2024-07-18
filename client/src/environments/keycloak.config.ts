import {KeycloakConfig} from 'keycloak-js'

const keycloakConfig: KeycloakConfig = {
    url: "http://localhost:8080",
    realm: "Customer",
    clientId: "demo-client"
};

export default keycloakConfig;