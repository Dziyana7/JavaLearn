import org.service.api.Service;

module jmp.cloud.service.impl {
    requires jmp.dto;
    exports org.exampleSeriveImpl;
    requires transitive jmp.service.api;
    provides Service with org.exampleSeriveImpl.ServiceImplementation;
}