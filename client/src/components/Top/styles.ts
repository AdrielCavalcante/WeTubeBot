import styled from 'styled-components';

export const Container = styled.div`
  display: flex;
  flex-direction: column;
  padding: 0 17px;
  background-color: #FF1800;
`;

export const Nav = styled.nav`
  display: flex;
  align-items: center;
  justify-content: flex-start;
`;

export const Title = styled.h3`
  margin-left: 9px;
  white-space: nowrap;
  font-size: 16pt;
  font-weight: bold;
  color: #FFD800;
`;

export const Main = styled.main`
  padding: 1.5em 5em 0 5em;
`;

export const Titulo = styled.h1`
  font-size: 28pt;
  color: #ffffe4;
  text-align: center;
  font-weight: 900;
  margin-bottom: .75em;
`;

export const Descricao = styled.p`
  font-size: 18pt;
  text-align: justify;
  color: #ffffe4;
  margin-bottom: 1em;
`;

export const DiscordButton = styled.button`
  font-size: 1em;
  height: 3em;
	border-radius: 12px;
	font-weight: 500;
	background-color: #5865f2;
	color: #fff;
	padding: 0 1em;

	display: flex;
	align-items: center;

	cursor: pointer;
	border: 0;
	transition: .5s;

  svg {
    font-size: 2.5em;
    margin-right: .25em;
  }

  :hover{
    background-color: #23272a;
  }
`;