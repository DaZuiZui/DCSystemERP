/**
 * 杨易达
 * @email: y51288033@outlook.com
 *         y51288033@gmail.com
 */
import http from "@/utils/httpRequest";

export function add(data) {
    return http({
        url: "/api/hello/hello",
        method: "post",
        data: data
    })
}

export function getUserInfoById(data) {
    return http({
        url: "/api/hi/hi",
        method: "get",
        params: data
    })
}
export function login(data) {
    return http({
        url: "/api/user/login",
        method: "post",
        data: data
    })
}
export function Register(data) {
    return http({
        url: "/api/user/userReg",
        method: "post",
        data: data
    })
}
export function Pagination(data) {
    return http({
        url: "/api/user/queryPageUser",
        method: "post",
        data: data
    })
}