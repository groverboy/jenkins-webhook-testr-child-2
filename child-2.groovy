{ ->
  node('shared-agent-1') {
    hello 'world (from child-2)'
  }
}
def hello(whom) {
  echo "hello ${whom}"
}
