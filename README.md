## Proton

Experimental attempt to bring [spacemacs][1] and [sublimious][2] style editing to atom.

![demo][3]

### What is it? 

Proton *(name subject to change)* is a very early attempt to mirror the modal editing style of spacemacs and sublimious and bring something equally powerful to atom. 

We get rid of the annoying part of atom - that being the configuration and package management - and __concentrate on the cool bits__ - it's full customisation capabilities. 

### Features
##### dotfile friendly configuration
proton will take care of setting up atom for you. All you need to do is configure your `~/.proton` file - your central configuration point

##### easy to remember keybindings

Noone has time to remember a ton of keybindings and then remember another ton for a new tool. Proton leverages spacesmacs mnemonic in which each keybinding is assigned to a specific category:

- `<spc> g s` will execute __g__it __s__tatus
- `<spc> p t` will toggle the __p__rojects __t__ree-view

you get the idea!


##### layer based configuration
Atom has __a ton__ of packages and only a subset of them being actually useful. Instead of finding all the good bits yourself, rely on a crowd-configured layer system that does it for you! Here is how it works:

Imagine you want to do some javascript in atom but you have no idea what to install and what to set up. Instead of just installing random packages by itself, you'll include the `:javascript` layer and boom! proton installs all the good packages and configuration for you. 

Check out [all available layers here][4].

### Install

Proton *(name subject to change)* is still in a very early stage. To install you'll have to compile it yourself, but no worries! It is very easy. 

#### Requirements
- atom / apm
- [leiningen](http://leiningen.org/)

#### Running it

```
lein cljsbuild once dev
```
will compile the clojurescript code into javascript. Once that's done, go into the `plugin/` folder and run

```
apm link
```

proton should now be installed inside atom

### License

GPLv3

[1]: https://github.com/syl20bnr/spacemacs/
[2]: https://github.com/dvcrn/sublimious
[3]: https://files.gitter.im/syl20bnr/spacemacs/YHKG/bar.gif
[4]: https://github.com/dvcrn/proton/tree/master/src/proton/layers