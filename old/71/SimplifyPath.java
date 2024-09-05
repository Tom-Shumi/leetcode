class Solution {
  public String simplifyPath(String path) {
    path = path.replaceAll("/*/", "/");
    path = path.replaceAll("^/|/$", "");

    if (path.equals("") || path.equals("/") || path.equals("..")) {
      return "/";
    }

    String[] pathArrar = path.split("/");

    String result = "/";

    Stack<String> stack = new Stack<>();
    for (int i = 0; i < pathArrar.length; i++) {
      if (pathArrar[i].equals(".")) {
        continue;
      } else if (pathArrar[i].equals("..")) {
        if (0 < stack.size()) {
          stack.pop();
        }
      } else {
        stack.push(pathArrar[i]);
      }
    }

    for (String element : stack) {
      result = result + element + "/";
    }
    if (result.equals("/")) {
      return "/";
    }
    return result.replaceAll("/$", "");
  }
}
