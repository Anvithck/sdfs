// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VolumeService.proto

package org.opendedup.grpc;

public final class VolumeServiceOuterClass {
  private VolumeServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_VolumeInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_VolumeInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_VolumeInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_VolumeInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_SystemInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_SystemInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_SystemInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_SystemInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_SystemInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_SystemInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_DSEInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_DSEInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_DSERequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_DSERequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_DSEResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_DSEResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_AuthenticationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_AuthenticationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_AuthenticationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_AuthenticationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_MessageQueueInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_MessageQueueInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_CleanStoreRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_CleanStoreRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_CleanStoreResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_CleanStoreResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_DeleteCloudVolumeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_DeleteCloudVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_DeleteCloudVolumeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_DeleteCloudVolumeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_SetLogicalVolumeCapacityRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_SetLogicalVolumeCapacityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendedup_grpc_SetLogicalVolumeCapacityResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_opendedup_grpc_SetLogicalVolumeCapacityResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023VolumeService.proto\022\022org.opendedup.grp" +
      "c\032\016Shutdown.proto\032\016FileInfo.proto\"\023\n\021Vol" +
      "umeInfoRequest\"\246\005\n\022VolumeInfoResponse\022\014\n" +
      "\004path\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\023\n\013currentSize" +
      "\030\003 \001(\003\022\021\n\tcapactity\030\004 \001(\003\022\031\n\021maxPercenta" +
      "geFull\030\005 \001(\001\022\026\n\016duplicateBytes\030\006 \001(\003\022\021\n\t" +
      "readBytes\030\007 \001(\001\022\022\n\nwriteBytes\030\010 \001(\003\022\024\n\014s" +
      "erialNumber\030\t \001(\003\022\017\n\007dseSize\030\n \001(\003\022\023\n\013ds" +
      "eCompSize\030\013 \001(\003\022\017\n\007readOps\030\014 \001(\001\022\020\n\010writ" +
      "eOps\030\r \001(\001\022\022\n\nreadErrors\030\016 \001(\003\022\023\n\013writeE" +
      "rrors\030\017 \001(\003\022\r\n\005files\030\020 \001(\003\022\030\n\020closedGrac" +
      "efully\030\021 \001(\010\022\032\n\022allowExternalLinks\030\022 \001(\010" +
      "\022\022\n\nusePerfMon\030\023 \001(\010\022\021\n\tclusterId\030\024 \001(\t\022" +
      "\027\n\017VolumeClustered\030\025 \001(\010\022\032\n\022readTimeoutS" +
      "econds\030\026 \001(\005\022\033\n\023writeTimeoutSeconds\030\027 \001(" +
      "\005\022\032\n\022compressedMetaData\030\030 \001(\010\022\021\n\tsyncFil" +
      "es\030\031 \001(\010\022\023\n\013maxPageSize\030\032 \001(\003\022B\n\014message" +
      "Queue\030\033 \003(\0132,.org.opendedup.grpc.Message" +
      "QueueInfoResponse\022\023\n\013perfMonFile\030\034 \001(\t\022\017" +
      "\n\007offline\030\035 \001(\010\"\337\001\n\nSystemInfo\022\025\n\ractive" +
      "Threads\030\001 \001(\005\022\024\n\014blocksStored\030\002 \001(\005\022\027\n\017m" +
      "axBlocksStored\030\003 \001(\005\022\022\n\ntotalSpace\030\004 \001(\003" +
      "\022\021\n\tfreeSpace\030\005 \001(\003\022\024\n\014totalCpuLoad\030\006 \001(" +
      "\001\022\020\n\010cpuCores\030\007 \001(\001\022\023\n\013sdfsCpuLoad\030\010 \001(\001" +
      "\022\023\n\013totalMemory\030\n \001(\001\022\022\n\nfreeMemory\030\013 \001(" +
      "\001\"\023\n\021SystemInfoRequest\"\204\001\n\022SystemInfoRes" +
      "ponse\022,\n\004info\030\001 \001(\0132\036.org.opendedup.grpc" +
      ".SystemInfo\022\r\n\005error\030\002 \001(\t\0221\n\terrorCode\030" +
      "\003 \001(\0162\036.org.opendedup.grpc.errorCodes\"\201\003" +
      "\n\007DSEInfo\022\017\n\007maxSize\030\001 \001(\003\022\023\n\013currentSiz" +
      "e\030\002 \001(\003\022\017\n\007entries\030\003 \001(\003\022\026\n\016compressedSi" +
      "ze\030\004 \001(\003\022\022\n\nfreeBlocks\030\005 \001(\003\022\020\n\010pageSize" +
      "\030\006 \001(\003\022\023\n\013storageType\030\007 \001(\t\022\022\n\nlistenPor" +
      "t\030\010 \001(\005\022\022\n\nlistenHost\030\t \001(\t\022\021\n\treadSpeed" +
      "\030\n \001(\005\022\022\n\nwriteSpeed\030\013 \001(\005\022\021\n\tcacheSize\030" +
      "\014 \001(\003\022\024\n\014maxCacheSize\030\r \001(\003\022\027\n\017listenEnc" +
      "rypted\030\016 \001(\010\022\025\n\rencryptionKey\030\017 \001(\t\022\024\n\014e" +
      "ncryptionIV\030\020 \001(\t\022\026\n\016cloudAccessKey\030\021 \001(" +
      "\t\022\026\n\016cloudSecretKey\030\022 \001(\t\"\014\n\nDSERequest\"" +
      "z\n\013DSEResponse\022)\n\004info\030\001 \001(\0132\033.org.opend" +
      "edup.grpc.DSEInfo\022\r\n\005error\030\002 \001(\t\0221\n\terro" +
      "rCode\030\003 \001(\0162\036.org.opendedup.grpc.errorCo" +
      "des\";\n\025AuthenticationRequest\022\020\n\010username" +
      "\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\"i\n\026Authenticati" +
      "onResponse\022\r\n\005token\030\001 \001(\t\022\r\n\005error\030\002 \001(\t" +
      "\0221\n\terrorCode\030\003 \001(\0162\036.org.opendedup.grpc" +
      ".errorCodes\"\304\001\n\030MessageQueueInfoResponse" +
      "\022\020\n\010hostName\030\001 \001(\t\022C\n\006mqType\030\002 \001(\01623.org" +
      ".opendedup.grpc.MessageQueueInfoResponse" +
      ".MQType\022\014\n\004port\030\003 \001(\005\022\r\n\005topic\030\004 \001(\t\022\020\n\010" +
      "authInfo\030\005 \001(\t\"\"\n\006MQType\022\014\n\010RabbitMQ\020\000\022\n" +
      "\n\006PubSub\020\001\"$\n\021CleanStoreRequest\022\017\n\007compa" +
      "ct\030\001 \001(\010\"g\n\022CleanStoreResponse\022\017\n\007eventI" +
      "D\030\001 \001(\t\022\r\n\005error\030\002 \001(\t\0221\n\terrorCode\030\003 \001(" +
      "\0162\036.org.opendedup.grpc.errorCodes\",\n\030Del" +
      "eteCloudVolumeRequest\022\020\n\010volumeid\030\001 \001(\003\"" +
      "n\n\031DeleteCloudVolumeResponse\022\017\n\007eventID\030" +
      "\001 \001(\t\022\r\n\005error\030\002 \001(\t\0221\n\terrorCode\030\003 \001(\0162" +
      "\036.org.opendedup.grpc.errorCodes\"/\n\037SetLo" +
      "gicalVolumeCapacityRequest\022\014\n\004size\030\001 \001(\003" +
      "\"d\n SetLogicalVolumeCapacityResponse\022\r\n\005" +
      "error\030\001 \001(\t\0221\n\terrorCode\030\002 \001(\0162\036.org.ope" +
      "ndedup.grpc.errorCodes2\267\006\n\rVolumeService" +
      "\022i\n\020AuthenticateUser\022).org.opendedup.grp" +
      "c.AuthenticationRequest\032*.org.opendedup." +
      "grpc.AuthenticationResponse\022^\n\rGetVolume" +
      "Info\022%.org.opendedup.grpc.VolumeInfoRequ" +
      "est\032&.org.opendedup.grpc.VolumeInfoRespo" +
      "nse\022[\n\016ShutdownVolume\022#.org.opendedup.gr" +
      "pc.ShutdownRequest\032$.org.opendedup.grpc." +
      "ShutdownResponse\022[\n\nCleanStore\022%.org.ope" +
      "ndedup.grpc.CleanStoreRequest\032&.org.open" +
      "dedup.grpc.CleanStoreResponse\022p\n\021DeleteC" +
      "loudVolume\022,.org.opendedup.grpc.DeleteCl" +
      "oudVolumeRequest\032-.org.opendedup.grpc.De" +
      "leteCloudVolumeResponse\022J\n\007DSEInfo\022\036.org" +
      ".opendedup.grpc.DSERequest\032\037.org.opended" +
      "up.grpc.DSEResponse\022[\n\nSystemInfo\022%.org." +
      "opendedup.grpc.SystemInfoRequest\032&.org.o" +
      "pendedup.grpc.SystemInfoResponse\022\205\001\n\030Set" +
      "LogicalVolumeCapacity\0223.org.opendedup.gr" +
      "pc.SetLogicalVolumeCapacityRequest\0324.org" +
      ".opendedup.grpc.SetLogicalVolumeCapacity" +
      "ResponseB2P\001Z.github.com/opendedup/sdfs-" +
      "client-go/sdfs/;sdfsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.opendedup.grpc.Shutdown.getDescriptor(),
          org.opendedup.grpc.FileInfo.getDescriptor(),
        });
    internal_static_org_opendedup_grpc_VolumeInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_opendedup_grpc_VolumeInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_VolumeInfoRequest_descriptor,
        new java.lang.String[] { });
    internal_static_org_opendedup_grpc_VolumeInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_opendedup_grpc_VolumeInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_VolumeInfoResponse_descriptor,
        new java.lang.String[] { "Path", "Name", "CurrentSize", "Capactity", "MaxPercentageFull", "DuplicateBytes", "ReadBytes", "WriteBytes", "SerialNumber", "DseSize", "DseCompSize", "ReadOps", "WriteOps", "ReadErrors", "WriteErrors", "Files", "ClosedGracefully", "AllowExternalLinks", "UsePerfMon", "ClusterId", "VolumeClustered", "ReadTimeoutSeconds", "WriteTimeoutSeconds", "CompressedMetaData", "SyncFiles", "MaxPageSize", "MessageQueue", "PerfMonFile", "Offline", });
    internal_static_org_opendedup_grpc_SystemInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_opendedup_grpc_SystemInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_SystemInfo_descriptor,
        new java.lang.String[] { "ActiveThreads", "BlocksStored", "MaxBlocksStored", "TotalSpace", "FreeSpace", "TotalCpuLoad", "CpuCores", "SdfsCpuLoad", "TotalMemory", "FreeMemory", });
    internal_static_org_opendedup_grpc_SystemInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_opendedup_grpc_SystemInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_SystemInfoRequest_descriptor,
        new java.lang.String[] { });
    internal_static_org_opendedup_grpc_SystemInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_org_opendedup_grpc_SystemInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_SystemInfoResponse_descriptor,
        new java.lang.String[] { "Info", "Error", "ErrorCode", });
    internal_static_org_opendedup_grpc_DSEInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_org_opendedup_grpc_DSEInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_DSEInfo_descriptor,
        new java.lang.String[] { "MaxSize", "CurrentSize", "Entries", "CompressedSize", "FreeBlocks", "PageSize", "StorageType", "ListenPort", "ListenHost", "ReadSpeed", "WriteSpeed", "CacheSize", "MaxCacheSize", "ListenEncrypted", "EncryptionKey", "EncryptionIV", "CloudAccessKey", "CloudSecretKey", });
    internal_static_org_opendedup_grpc_DSERequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_org_opendedup_grpc_DSERequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_DSERequest_descriptor,
        new java.lang.String[] { });
    internal_static_org_opendedup_grpc_DSEResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_org_opendedup_grpc_DSEResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_DSEResponse_descriptor,
        new java.lang.String[] { "Info", "Error", "ErrorCode", });
    internal_static_org_opendedup_grpc_AuthenticationRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_org_opendedup_grpc_AuthenticationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_AuthenticationRequest_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_org_opendedup_grpc_AuthenticationResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_org_opendedup_grpc_AuthenticationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_AuthenticationResponse_descriptor,
        new java.lang.String[] { "Token", "Error", "ErrorCode", });
    internal_static_org_opendedup_grpc_MessageQueueInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_org_opendedup_grpc_MessageQueueInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_MessageQueueInfoResponse_descriptor,
        new java.lang.String[] { "HostName", "MqType", "Port", "Topic", "AuthInfo", });
    internal_static_org_opendedup_grpc_CleanStoreRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_org_opendedup_grpc_CleanStoreRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_CleanStoreRequest_descriptor,
        new java.lang.String[] { "Compact", });
    internal_static_org_opendedup_grpc_CleanStoreResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_org_opendedup_grpc_CleanStoreResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_CleanStoreResponse_descriptor,
        new java.lang.String[] { "EventID", "Error", "ErrorCode", });
    internal_static_org_opendedup_grpc_DeleteCloudVolumeRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_org_opendedup_grpc_DeleteCloudVolumeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_DeleteCloudVolumeRequest_descriptor,
        new java.lang.String[] { "Volumeid", });
    internal_static_org_opendedup_grpc_DeleteCloudVolumeResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_org_opendedup_grpc_DeleteCloudVolumeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_DeleteCloudVolumeResponse_descriptor,
        new java.lang.String[] { "EventID", "Error", "ErrorCode", });
    internal_static_org_opendedup_grpc_SetLogicalVolumeCapacityRequest_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_org_opendedup_grpc_SetLogicalVolumeCapacityRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_SetLogicalVolumeCapacityRequest_descriptor,
        new java.lang.String[] { "Size", });
    internal_static_org_opendedup_grpc_SetLogicalVolumeCapacityResponse_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_org_opendedup_grpc_SetLogicalVolumeCapacityResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_opendedup_grpc_SetLogicalVolumeCapacityResponse_descriptor,
        new java.lang.String[] { "Error", "ErrorCode", });
    org.opendedup.grpc.Shutdown.getDescriptor();
    org.opendedup.grpc.FileInfo.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}