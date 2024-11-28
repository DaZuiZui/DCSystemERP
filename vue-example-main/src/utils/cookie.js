//引入vue-cookies
import cookies from "vue-cookies";
//封装token本地存储的方法
export const SET_TOKEN = (token) => {
    cookies.set("TOKEN", JSON.stringify(token))
}
export const GET_TOKEN = () => {
    return JSON.parse(cookies.get('TOKEN'))
}
export const REMOVE_TOKEN = () => {
    return cookies.remove('TOKEN')
}
// 清除所有 cookies 的函数
// export const clearAllCookies = () => {
//     const cookies = document.cookie.split(';'); // 获取所有 cookie 并分割为数组
//     cookies.forEach(cookie => {
//         const cookieName = cookie.split('=')[0].trim(); // 获取 cookie 的名称
//         document.cookie = `${cookieName}=; expires=Thu, 01 Jan 1970 00:00:00 UTC; path=/;`; // 设置过期时间为过去的时间，清除 cookie
//     });
// }
