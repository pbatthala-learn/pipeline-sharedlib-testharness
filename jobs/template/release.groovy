jc = library('jenkins-commons')

release_lib = jc.org.hcm.libjenkins.Release.new(this)

node() {
  echo "Hello World!"
}

return this
