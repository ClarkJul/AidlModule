package com.clark.ipc;
// Declare any non-default types here with import statements
import com.clark.ipc.model.Request;
import com.clark.ipc.model.Response;
interface IIPCService {
    Response send(in Request request);
}
