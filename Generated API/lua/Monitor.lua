--Meta class

Interpreter = {name=0}
local currentstate
local CANCELLED, FINISHED, FAULTED, IDLE, INSTANTIATED,  READY = -2, -1, 0, 1, 2, 3
-- Base class method new


function Interpreter:fromURL (o,nam)
 o = o or {}
 setmetatable(o,self)
 self.__index = self
 nam = nam or 0
 local scxml   = io.open(nam):read('*all')
 machine = LXSC:parse(scxml)
 self.name = machine
 currentstate=IDLE
 return o
 end

function Interpreter:onExit()
end
function Interpreter:onEntry()
end
function Interpreter:onTransition()
end

