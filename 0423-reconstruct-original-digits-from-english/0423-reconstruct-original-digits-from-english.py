class Solution:
    def originalDigits(self, s: str) -> str:
        d = {}
        for ch in s:
            d[ch] = d.get(ch, 0) + 1
        
        result = ""

        if 'z' in d:
            result += '0' * d['z']
            d['o'] -= d['z']
            d['e'] -= d['z']
            d['r'] -= d['z']
            d['z'] = 0

        if 'w' in d:
            result += '2' * d['w']
            d['t'] -= d['w']
            d['o'] -= d['w']
            d['w'] = 0
        
        if 'u' in d:
            result += '4' * d['u']
            d['f'] -= d['u']
            d['o'] -= d['u']
            d['r'] -= d['u']
            d['u'] = 0

        if 'x' in d:
            result += '6' * d['x']
            d['s'] -= d['x']
            d['i'] -= d['x']
            d['x'] = 0
        
        if 'g' in d:
            result += '8' * d['g']
            d['e'] -= d['g']
            d['i'] -= d['g']
            d['h'] -= d['g']
            d['t'] -= d['g']
            d['g'] = 0

        if 'o' in d and d['o'] > 0:
            result += '1' * d['o']
            d['n'] -= d['o']
            d['e'] -= d['o']
            d['o'] = 0

        if 'h' in d and d['h'] > 0:
            result += '3' * d['h']
            d['t'] -= d['h']
            d['r'] -= d['h']
            d['e'] -= 2 * d['h']
            d['h'] = 0

        if 'f' in d and d['f'] > 0:
            result += '5' * d['f']
            d['i'] -= d['f']
            d['v'] -= d['f']
            d['e'] -= d['f']
            d['f'] = 0

        if 's' in d and d['s'] > 0:
            result += '7' * d['s']
            d['e'] -= 2 * d['s']
            d['v'] -= d['s']
            d['n'] -= d['s']
            d['s'] = 0

        if 'i' in d and d['i'] > 0:
            result += '9' * d['i']
            d['n'] -= 2 * d['i']
            d['e'] -= d['i']
            d['i'] = 0

        return ''.join(sorted(result))