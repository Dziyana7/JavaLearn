import org.ServiceAPI.Service;

module jmp.service.api {
    requires jmp.dto;
    exports org.ServiceAPI;
    provides Service with ServiceImplementation;
}