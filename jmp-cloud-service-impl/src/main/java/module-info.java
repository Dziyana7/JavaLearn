import org.example.serive.impl.ServiceImplementation;
import org.service.api.Service;

module jmp.cloud.service.impl {
    requires jmp.dto;
    exports org.example.serive.impl;
    requires transitive jmp.service.api;
    provides Service with ServiceImplementation;
}