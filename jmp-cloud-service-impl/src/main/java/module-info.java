module jmp.cloud.service.impl {
    requires jmp.dto;
    exports org.exampleSeriveImpl;
    requires transitive jmp.service.api;
}